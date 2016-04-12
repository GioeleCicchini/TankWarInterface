import com.fasterxml.jackson.databind.ObjectMapper;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Created by gioele on 24/03/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.createContext("/test1", new MyHandler1());


        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Apertura Server");
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {

            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class MyHandler1 implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {

            ObjectMapper mapper = new ObjectMapper();
         JavaBean prova = new JavaBean();

            String response = mapper.writeValueAsString(prova) ;
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }



}
