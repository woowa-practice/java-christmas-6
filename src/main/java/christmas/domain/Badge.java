package christmas.domain;

public class Badge {
    private String badge;

    public Badge() {
        this.badge = "없음";
    }

    public String giveBadge(int price) {
        if (price >= 20000) return "산타";
        if (price >= 10000) return "트리";
        if (price >= 5000) return "별";
        return badge;
    }
}
