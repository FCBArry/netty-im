package aio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

public class AIOClient {
    public static void main(String[] args) throws Exception {
        AsynchronousSocketChannel client = AsynchronousSocketChannel.open();
        client.connect(new InetSocketAddress("127.0.0.1", 8000)).get();
        client.write(ByteBuffer.wrap("hello world".getBytes()));
        Thread.sleep(1000000);
    }
}