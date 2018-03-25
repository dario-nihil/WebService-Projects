package ch01.ts;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "ch01.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		
		return new Date().toString();
	}

	@Override
	public long getTimeAsLong() {

		return new Date().getTime();
	}

}
