package ChainOfResponbilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == LogProcessor.ERROR) {
            System.out.println("Error Log: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
