/**
 * nuomi.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */

package com.lhrl.nuomi;


public class NuomiResponse  {

	protected String    errno;

    protected String    msg;

    protected NuomiUser 	data;

    public String getErrno() {
        return this.errno;
    }

    public void setErrno(String errno) {
        this.errno = errno;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

	public NuomiUser getData() {
		return data;
	}

	public void setData(NuomiUser data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "NuomiResponse [errno=" + errno + ", msg=" + msg + ", data="
				+ data + "]";
	}

   


}
