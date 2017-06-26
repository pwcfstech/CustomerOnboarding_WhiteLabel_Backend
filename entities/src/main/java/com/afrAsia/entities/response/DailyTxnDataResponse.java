package com.afrAsia.entities.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.afrAsia.entities.jpa.DigitalTxnDaily;

import javax.xml.bind.annotation.XmlAccessOrder;

/**
 * 
 * @author nyalfernandes
 *
 */
@XmlRootElement(name="transaction")
@XmlType(propOrder={"remitterIFSCCode", "recipientIFSCCode", "txnValue", "txnStatus", "txnMode", "merchantTypeCode", "errorCode", "responseCode", "txtType"})
public class DailyTxnDataResponse implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    private String remitterIFSCCode;
    
    
    private String recipientIFSCCode;
    
    
    private String txnValue;
    
    
    private String txnStatus;
    
    
    private String txnMode;
    
    
    private String merchantTypeCode;
    
    
    private String txtType;
    
      
//    private Date txnDate;
    
    
    private String responseCode;
    
    
    private String errorCode;
    
    @XmlAttribute(name="ERROR_CODE")
    public String getErrorCode() 
    {
		return errorCode;
	}
    
    
    public void setErrorCode(String errorCode) 
    {
		this.errorCode = errorCode;
	}

    @XmlAttribute(name="REMITTER_IFSC_CODE")
    public String getRemitterIFSCCode()
    {
        return remitterIFSCCode;
    }

    public void setRemitterIFSCCode(String remitterIFSCCode)
    {
        this.remitterIFSCCode = remitterIFSCCode;
    }

    @XmlAttribute(name="RECIPIENT_IFSC_CODE")
    public String getRecipientIFSCCode()
    {
        return recipientIFSCCode;
    }

    public void setRecipientIFSCCode(String recipientIFSCCode)
    {
        this.recipientIFSCCode = recipientIFSCCode;
    }

    @XmlAttribute(name = "TXN_VALUE")
    public String getTxnValue()
    {
        return txnValue;
    }

    public void setTxnValue(String txnValue)
    {
        this.txnValue = txnValue;
    }

    @XmlAttribute(name = "TXN_STATUS")
    public String getTxnStatus()
    {
        return txnStatus;
    }

    public void setTxnStatus(String txnStatus)
    {
        this.txnStatus = txnStatus;
    }

    @XmlAttribute(name = "TXN_MODE")
    public String getTxnMode()
    {
        return txnMode;
    }

    public void setTxnMode(String txnMode)
    {
        this.txnMode = txnMode;
    }

    @XmlAttribute(name = "MERCHANT_TYPE_CODE")
    public String getMerchantTypeCode()
    {
        return merchantTypeCode;
    }

    public void setMerchantTypeCode(String merchantTypeCode)
    {
        this.merchantTypeCode = merchantTypeCode;
    }

    @XmlAttribute(name = "TXN_TYPE")
    public String getTxtType()
    {
        return txtType;
    }

    public void setTxtType(String txtType)
    {
        this.txtType = txtType;
    }

//    @XmlAttribute(name = "TXN_DATE")
//    public Date getTxnDate()
//    {
//        return txnDate;
//    }

//    public void setTxnDate(Date txnDate)
//    {
//        this.txnDate = txnDate;
//    }

    @XmlAttribute(name = "RESPONSE_CODE")
    public String getResponseCode()
    {
        return responseCode;
    }

    public void setResponseCode(String responseCode)
    {
        this.responseCode = responseCode;
    }
    
    public static DailyTxnDataResponse parse(DigitalTxnDaily i)
    {
        DailyTxnDataResponse o = new DailyTxnDataResponse();
        if (i == null)
        {
            return o;
        }

        o.setMerchantTypeCode(i.getMerchantTypeCode() == null ? "" : appendZeros(i.getMerchantTypeCode().toString(), 4));
        o.setRecipientIFSCCode(i.getRecipientIFSCCode() == null ? "" : i.getRecipientIFSCCode());
        o.setRemitterIFSCCode(i.getRemitterIFSCCode() == null ? "" : i.getRemitterIFSCCode());
//        o.setTxnDate(i.getTxnDate());
        o.setTxnMode(i.getTxnMode() == null ? "" : appendZeros(i.getTxnMode().toString(), 3));
        o.setTxnStatus(i.getRemitterIFSCCode() == null ? "" : i.getTxnStatus());
        o.setTxnValue(i.getRemitterIFSCCode() == null ? "" : i.getTxnValue().toString());
        o.setTxtType(i.getRemitterIFSCCode() == null ? "" : i.getTxtType());
        o.setResponseCode(i.getResponseCode() == null ? "" : i.getResponseCode());
        o.setErrorCode(i.getErrorCode() == null ? "" : i.getResponseCode());
        
        
        return o;
    }

	@Override
	public String toString() {
		return "DailyTxnDataResponse [remitterIFSCCode=" + remitterIFSCCode + ", recipientIFSCCode=" + recipientIFSCCode
				+ ", txnValue=" + txnValue + ", txnStatus=" + txnStatus + ", txnMode=" + txnMode + ", merchantTypeCode="
				+ merchantTypeCode + ", txtType=" + txtType + ", responseCode=" + responseCode
				+ "]";
	}
	
	public static String appendZeros(String in, int size)
	{
		if (in == null)
		{
			return null;
		}
		
		in = in.trim();
		int toAppend = size - in.length();
		
		StringBuilder sb = new StringBuilder();
		if (toAppend > 0)
		{
			for (int i = 0; i < toAppend; i++)
			{
				sb.append("0");
			}
		}
		sb.append(in);
		
		return sb.toString();
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(appendZeros("Hello", 7));
	}
    
    
}
