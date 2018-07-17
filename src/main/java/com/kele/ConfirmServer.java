package com.kele;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConfirmServer {
    private static ExecutorService threadPool;
    private static final int MAX_THREAD_NUM = 10;

    public ConfirmServer(){
        threadPool = Executors.newFixedThreadPool(MAX_THREAD_NUM);
    }

    public void register(Object service, int port){
        try {
            System.out.println("server starts...");
            ServerSocket server = new ServerSocket(port);
            Socket socket = null;
            while((socket = server.accept()) != null){
                System.out.println("client connected...");
//                threadPool.execute(new Processor(socket, service));
            }

        }catch (Exception e){

        }
    }

    class Processor {
        public Processor(Socket socket, Object service){

        }
    }
}
