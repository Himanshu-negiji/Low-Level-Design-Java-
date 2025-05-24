package ChainOfResponbilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == LogProcessor.DEBUG) {
            System.out.println("Debug Log: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
