/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiQpsDataResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiQpsDataResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiQpsDataResponseUnmarshaller {

	public static DescribeApiQpsDataResponse unmarshall(DescribeApiQpsDataResponse describeApiQpsDataResponse, UnmarshallerContext context) {
		
		describeApiQpsDataResponse.setRequestId(context.stringValue("DescribeApiQpsDataResponse.RequestId"));

		List<MonitorItem> callSuccesses = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiQpsDataResponse.CallSuccesses.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiQpsDataResponse.CallSuccesses["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiQpsDataResponse.CallSuccesses["+ i +"].ItemValue"));

			callSuccesses.add(monitorItem);
		}
		describeApiQpsDataResponse.setCallSuccesses(callSuccesses);

		List<MonitorItem> callFails = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiQpsDataResponse.CallFails.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiQpsDataResponse.CallFails["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiQpsDataResponse.CallFails["+ i +"].ItemValue"));

			callFails.add(monitorItem);
		}
		describeApiQpsDataResponse.setCallFails(callFails);
	 
	 	return describeApiQpsDataResponse;
	}
}