package ChainOfResponbilityDesignPattern;

public abstract class LogProcessor {

    protected static final int DEBUG = 1;
    protected static final int INFO = 2;
    protected static final int ERROR = 3;

    LogProcessor nextProcessor;

    public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void log(int logLevel, String message) {
        if(nextProcessor != null) {
            this.nextProcessor.log(logLevel, message);
        }
    }
}
