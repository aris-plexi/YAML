import java.io.*;


public class Cmd {

    public void execute() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/k");
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        Process p = pb.start();

        try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(p.getOutputStream()), true)){
            pw.println("cd src/main/resources");//command 1
            pw.println("kingraph families.yaml > families.svg");//command 2
            pw.println("exit");//end processing
        }
        p.waitFor();

        System.out.println("---------------- after process ended ----------------");

    }


}
