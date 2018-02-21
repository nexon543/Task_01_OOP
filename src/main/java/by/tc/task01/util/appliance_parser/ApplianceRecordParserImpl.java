package by.tc.task01.util.appliance_parser;

import java.util.HashMap;
import java.util.Map;

public class ApplianceRecordParserImpl implements ApplianceRecordParser {
	public Map <String, String> parse (String applianceRecord){// надо было поработать над именами переменных, а иначе без полного погружения в предметную область и не поймешь, что ты тут делаешь
		Map <String, String> applianceProperties=new HashMap();
		String [] splited=applianceRecord.split(":");
		applianceProperties.put("applianceType",	splited[0].trim());
		splited[1]=splited[1].substring(0,splited[1].length()-1);
		String[]properties=splited[1].split(",");
		for (String property:properties) {
			String splittedProp[]=property.trim().split("=");
			applianceProperties.put(splittedProp[0], splittedProp[1]);
		}
		return applianceProperties;
	}
}
