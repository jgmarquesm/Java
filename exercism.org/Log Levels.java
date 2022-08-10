public class LogLevels {
    
    public static String message(String logLine) {
        String mensagem;
        int len = logLine.length();
        if (logLine.substring(1, 8).equals("WARNING")){
            mensagem = logLine.substring(8, len);
        } else if (logLine.substring(1, 5).equals("INFO")){
            mensagem = logLine.substring(5, len);
        } else {
            mensagem = logLine.substring(6, len);
        }
        return mensagem.replace("\r", "").replace("\n", "").replace("\t", "")
            .replace("]", "").replace("[", "").replace(":", "").strip();
    }
    public static String logLevel(String logLine) {
        String nivel;
        if (logLine.substring(1, 8).equals("WARNING")){
            nivel = "warning";
        } else if (logLine.substring(1, 5).equals("INFO")){
            nivel = "info";
        } else {
            nivel = "error";
        }
        return nivel;
    }
    public static String reformat(String logLine) {
        String retorno = message(logLine) + " (" + logLevel(logLine) + ")";
        return retorno;
    }
}
