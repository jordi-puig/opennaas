package org.opennaas.core.protocols.sessionmanager.shell;

import org.opennaas.core.resources.IResourceIdentifier;
import org.opennaas.core.resources.IResourceManager;
import org.opennaas.core.resources.shell.GenericKarafCommand;
import org.opennaas.core.resources.protocol.IProtocolManager;
import org.opennaas.core.resources.protocol.IProtocolSession;
import org.opennaas.core.resources.protocol.IProtocolSessionManager;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;

/**
 * List the device ids registere do the protocol manager
 * 
 * @author Pau Minoves
 * 
 */
@Command(scope = "protocols", name = "info", description = "Provide extended information on a protocol session.")
public class InfoCommand extends GenericKarafCommand {

	IProtocolManager	protocolManager	= null;

	@Argument(name = "resourceType:resourceName", index = 0, required = true, description = "The device owning the session.")
	String				resourceId;

	@Argument(name = "sessionId", index = 1, required = true, description = "The session to lookup.")
	String				sessionId;

	@Override
	protected Object doExecute() throws Exception {
		initcommand("protocols information");

		IResourceManager manager = getResourceManager();

		if (!splitResourceName(resourceId))
			return null;

		IResourceIdentifier resourceIdentifier = manager.getIdentifierFromResourceName(argsRouterName[0], argsRouterName[1]);

		protocolManager = getProtocolManager();
		IProtocolSessionManager protocolSessionManager = protocolManager.getProtocolSessionManager(resourceIdentifier.getId());

		if (protocolSessionManager == null) {
			printError("Wrong deviceId");
			return null;
		}

		IProtocolSession protocolSession = protocolSessionManager.obtainSessionById(sessionId, false);

		if (protocolSession == null) {
			printError("Unable to obtain a session with session id: " + sessionId);
			return null;
		}
		printSymbol(horizontalSeparator);
		printInfo("Protocol session context");
		for (String key : protocolSession.getSessionContext().getSessionParameters().keySet()) {
			printInfo(key + " = " + protocolSession.getSessionContext().getSessionParameters().get(key));
		}
		printSymbol(horizontalSeparator);
		printInfo("Protocol session self-description");

		printInfo(protocolSession.toString());
		endcommand();
		return null;
	}

}