package Item1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SensitiveData {

    public static void main(String args){

    }

    void readData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("file")));

        String data = br.readLine();
    }

    void readDataSolution(){
        ByteBuffer buffer = ByteBuffer.allocateDirect(16 * 1024);

        try(FileChannel rdr = (new FileInputStream("file")).getChannel()){

            while (rdr.read(buffer) > 0){
                buffer.clear();
            }
        }catch (Throwable e){
            //Handle error
        }
    }
}
