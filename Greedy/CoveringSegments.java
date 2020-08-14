import java.util.*;

public class CoveringSegments {

    private static List<Integer> optimalPoints(List<Segment> segments) {

        Collections.sort(segments, new Comparator<Segment>() {
            @Override public int compare(Segment p1, Segment p2) {
                return p1.end - p2.end; // Ascending
            }
        });

        List<Integer> points = new ArrayList<>();
        points.add(segments.get(0).end);
        for (int i = 0; i <= segments.size();) {

            Segment point = segments.get(i);

            int spot = 0;

            for (int j = i; j < segments.size(); j++) {
                Segment t = segments.get(j);
                spot = j;

                if (point.end < t.start) {
                    points.add(t.end);
                    break;
                }
            }

            i = spot;

            if (i == segments.size() -1 ) {
                break;
            }

        }

        return points;
    }

    // No getters and setters? Bad!
    private static class Segment {
        int start, end;
        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Segment> segments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start, end;
            start = in.nextInt();
            end = in.nextInt();
            segments.add(new Segment(start, end));
        }

        List<Integer> points = optimalPoints(segments);
        System.out.println(points.size());
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}