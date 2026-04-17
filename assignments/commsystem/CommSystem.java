import java.util.ArrayList;

public class CommSystem {

    private String stationNer;
    private ArrayList<String> log;
    private int signalHvch;
    private boolean offline;

    public CommSystem(String stationNer) {
        this.stationNer = stationNer;
        log = new ArrayList<>();
        signalHvch = 100;
        offline = false;
    }

    public String ilgeeh(String hvleenAvagch, String mesg) {
        if (offline) {
            return "📡 Офлайн!";
        }
        signalHvch -= 5;
        if (signalHvch < 10) {
            offline = true;
        }
        log.add("→ " + hvleenAvagch + ": " + mesg);
        return "Илгээлээ: " + hvleenAvagch;
    }

    public void hvleenAvah(String ilgeegch, String mesg) {
        log.add("← " + ilgeegch + ": " + mesg);
    }

    public void signalSergemjuuleh() {
        signalHvch = 100;
        offline = false;
    }

    public String logHarah(int n) {
        if (log.isEmpty()) return "";
        int start = log.size() - Math.min(n, log.size());
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < log.size(); i++) {
            if (i > start) sb.append("\n");
            sb.append(log.get(i));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        String status = offline ? "OFFLINE" : "ONLINE";
        return "📡 " + stationNer + " [" + status + "] Signal: "
                + signalHvch + "% | Лог: " + log.size() + " мессеж";
    }
}
