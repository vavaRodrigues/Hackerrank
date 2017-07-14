import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MariaQuatradas{

    public static void main(String[] args) throws IOException {
        StringBuffer stringB = new StringBuffer();
        BufferedReader bufferR = new BufferedReader(new InputStreamReader(System.in));

        for(byte E = Byte.parseByte(bufferR.readLine()); E > 0; --E){
            String[] input = bufferR.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            int C = (int)(Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);
            stringB.append(C + "\n");
        }

        System.out.print(stringB);
    }
}