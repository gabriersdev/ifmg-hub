package testing;

public record Record(String param1, int param2) {
    public String toString() {
        return param1 + param2;
    }
}