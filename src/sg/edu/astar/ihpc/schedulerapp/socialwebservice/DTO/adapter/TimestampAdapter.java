package sg.edu.astar.ihpc.schedulerapp.socialwebservice.DTO.adapter;

import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TimestampAdapter extends XmlAdapter<Date, Timestamp>{

	@Override
	public Date marshal(Timestamp v) throws Exception {
		return new Date(v.getTime());
	}
	
	@Override
	public Timestamp unmarshal(Date v) throws Exception {
		return new Timestamp(v.getTime());
	}

}
