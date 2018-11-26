package com.zl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

public class BufferTest {

    @Test
    public void test() throws Exception {
        RandomAccessFile aFile = new RandomAccessFile("文章.txt", "rw");
        FileChannel inChannel = aFile.getChannel();
        // create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);
        // CharBuffer charBuffer = CharBuffer.allocate(48);
        int bytesRead = inChannel.read(buf); // read into buffer.
        int i = 0;
        while (bytesRead != -1) {
            buf.flip(); // make buffer ready for read
            System.out.println();
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get()); // read 1 byte at a time
            }
            buf.clear(); // make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }

    @Test
    public void test1() throws IOException {
        RandomAccessFile fromFile = new RandomAccessFile("文章.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
        FileChannel toChannel = toFile.getChannel();

        long position = 0;
        long count = fromChannel.size();
        toChannel.transferFrom(fromChannel, position, count);
        toFile.close();
        fromFile.close();
    }

    @Test
    public void test2() throws Exception {
        @SuppressWarnings("resource")
       RandomAccessFile toFile = new RandomAccessFile("writeFile.txt", "rw");
        FileChannel channel = toFile.getChannel();
        String newData = "我write";// System.currentTimeMillis();
        /*System.out.println("长度："+newData.getBytes("utf-8").length);*/
        ByteBuffer buf = ByteBuffer.allocate(newData.length());
        buf.clear();
        buf.put(newData.getBytes());

        buf.flip();
        while (buf.hasRemaining()) {
            channel.write(buf);
        }
        channel.close();
    }
}
