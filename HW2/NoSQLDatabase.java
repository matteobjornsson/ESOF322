public class NoSQLDatabase extends Database {
    public NoSQLDatabase() {
        this.st = new DocumentStore();
    }
}
