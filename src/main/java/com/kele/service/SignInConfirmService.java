package com.kele.service;

import com.kele.util.RedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SignInConfirmService extends UnicastRemoteObject implements ISignInConfirm  {
    private static RedisUtil redisUtil = RedisUtil.getInstance();
    public SignInConfirmService()throws RemoteException{
        super();
    }
    public String confirmAndGetUserId(String token)throws RemoteException {
        if(token == null) return null;
        JedisPool pool = redisUtil.getJedisPool();
        Jedis jedis = pool.getResource();
        return jedis.get(token);

    }


}
