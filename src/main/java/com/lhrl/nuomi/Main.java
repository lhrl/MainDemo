package com.lhrl.nuomi;

import java.math.BigDecimal;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		TpData tpData=new TpData();
		
		tpData.setAppKey("MMM4hG");
		
		tpData.setDealId("20000745");
		
		tpData.setTpOrderId("1234567890");
		
		tpData.setRsaSign("QsdKDR62UfdMQlCXPCMTbyBja8XifUSsAhX/fgV");
		
		tpData.setTotalAmount("1000");
		
		tpData.setPayResultUrl("");
		
		tpData.setReturnData(new ReturnData());
		
		DisplayData displayData=new DisplayData();
		
		
		//�齨casierToblockList
		List<CashierTopBlock>cashList=new ArrayList<CashierTopBlock>();
		CashierTopBlock cahBlock=new CashierTopBlock();
		cahBlock.setLeftCol("��Ʒ����");
		cahBlock.setRightCol("ƻ������");
		
		CashierTopBlock cahBlock1=new CashierTopBlock();
		cahBlock1.setLeftCol("����");
		cahBlock1.setRightCol("1");
		
		CashierTopBlock cahBlock2=new CashierTopBlock();
		cahBlock2.setLeftCol("�۸�");
		cahBlock2.setRightCol("100");
		
		cashList.add(cahBlock);
		cashList.add(cahBlock1);
		cashList.add(cahBlock2);
		
		
		List<CashierTopBlock>cashList1=new ArrayList<CashierTopBlock>();
		CashierTopBlock cahBlock3=new CashierTopBlock();
		cahBlock3.setLeftCol("�ͻ���ַ");
		cahBlock3.setRightCol("�����к�����");
		
		CashierTopBlock cahBlock4=new CashierTopBlock();
		cahBlock4.setLeftCol("�ͻ�ʱ��");
		cahBlock4.setRightCol("2017-03-10");
		
		
		cashList1.add(cahBlock3);
		cashList1.add(cahBlock4);
		
		
		List<List<CashierTopBlock>>cashierToBlockList=new ArrayList<List<CashierTopBlock>>();
		/*cashierToBlockList.add(cashList);
		cashierToBlockList.add(cashList1);*/
		displayData.setListCashers(cashierToBlockList);
		
		tpData.setDisplayData(displayData);
		
		tpData.setDealTitle("ƻ��6��");
		
		tpData.setDealSubTitle("6���츻ʿ");
		
		tpData.setDealThumbView("111.jpg");
		
		
		
		try {
			ObjectMapper objectMapper=new ObjectMapper();
			System.out.println("------------------jackson------------------------------");
			String json=objectMapper.writeValueAsString(tpData);
			System.out.println(json);
			TpData tpData2 =objectMapper.readValue(json, TpData.class);
			System.out.println(tpData2);
			System.out.println("------------------fastjson------------------------------");
			JSONObject jsonObject=new JSONObject();
			String json1=jsonObject.toJSONString(tpData);
			System.out.println( json1);
			System.out.println("------------------------------------------------");
			TpData tpData3=jsonObject.parseObject(json1, TpData.class);
			System.out.println(tpData3);
			
			System.out.println("-----------------------------------------------------");
			NuomiResponse nuomiResponse=new NuomiResponse();
			nuomiResponse.setErrno("11101");
			nuomiResponse.setMsg("signǩ������");
			NuomiUser user=new NuomiUser();
			user.setMobile("18221482595");
			user.setSiteId("nuomi1102");
			nuomiResponse.setData(user);
			String nuomi=objectMapper.writeValueAsString(nuomiResponse);
			System.out.println(nuomi);
			/*String str="{\"errno\":\"11101\",\"msg\":\"signǩ������\",\"data\":{}}";*/
			NuomiResponse nuo =objectMapper.readValue(nuomi, NuomiResponse.class);
			System.out.println(nuo);
			
			
			BigDecimal bigDecimal=new BigDecimal(100);
			System.out.println(bigDecimal.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
