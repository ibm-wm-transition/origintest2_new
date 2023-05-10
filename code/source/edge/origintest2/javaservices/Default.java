package edge.origintest2.javaservices;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.net.InetAddress;
import java.net.UnknownHostException;
// --- <<IS-END-IMPORTS>> ---

public final class Default

{
	// ---( internal utility methods )---

	final static Default _instance = new Default();

	static Default _newInstance() { return new Default(); }

	static Default _cast(Object o) { return (Default)o; }

	// ---( server methods )---




	public static final void testJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(testJavaService)>> ---
		// @sigtype java 3.5
		// [o] field:0:required ip
		// [o] field:0:required hostname
		// pipeline
		
		
		
		InetAddress ip;
		String hostname = "UNKNOWN";
		String ipStr = "UNKNOWN";
		try {
		    ip = InetAddress.getLocalHost();
		    ipStr = ip.toString();
		    hostname = ip.getHostName();
		} catch (UnknownHostException e) {
		    e.printStackTrace();
		}
		
		// pipeline
				IDataCursor pipelineCursor = pipeline.getCursor();
				IDataUtil.put( pipelineCursor, "ip", ipStr );
				IDataUtil.put( pipelineCursor, "hostname", hostname );
				pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

