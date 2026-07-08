package MCC;

import java.util.*;

public class Solution {

    static class Tradesman {
        int id, u, v, t;
        boolean picked = false, done = false;

        Tradesman(int id, int u, int v, int t) {
            this.id = id;
            this.u = u;
            this.v = v;
            this.t = t;
        }
    }

    static class Train {
        int id, pos;
        List<Integer> passengers = new ArrayList<>();

        Train(int id, int pos) {
            this.id = id;
            this.pos = pos;
        }
    }

    static List<Integer>[] graph;
    static int V;
    static int[] parent;

    static void bfs(int src) {
        parent = new int[V + 1];
        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        parent[src] = src;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nei : graph[node]) {
                if (parent[nei] == -1) {
                    parent[nei] = node;
                    q.add(nei);
                }
            }
        }
    }

    static int getNext(int src, int dest) {
        bfs(dest);
        return parent[src];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        int E = sc.nextInt();

        graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        int T = sc.nextInt();
        int[] trainPos = new int[T + 1];

        for (int i = 1; i <= T; i++) {
            trainPos[i] = sc.nextInt();
        }

        int C = sc.nextInt();
        int N = sc.nextInt();

        Tradesman[] trades = new Tradesman[N];
        for (int i = 0; i < N; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            trades[i] = new Tradesman(i + 1, u, v, t);
        }

        Train[] trains = new Train[T + 1];
        for (int i = 1; i <= T; i++) {
            trains[i] = new Train(i, trainPos[i]);
        }

        List<String> output = new ArrayList<>();

        int tick = 1;
        int done = 0;

        while (done < N && tick <= 10000) {

            List<String> actions = new ArrayList<>();
            Set<String> usedEdges = new HashSet<>();

            for (Train train : trains) {
                if (train == null) continue;

                Iterator<Integer> it = train.passengers.iterator();
                while (it.hasNext()) {
                    int pid = it.next();
                    Tradesman tr = trades[pid - 1];
                    if (train.pos == tr.v) {
                        actions.add("drop " + train.id + " " + tr.id);
                        tr.done = true;
                        it.remove();
                        done++;
                    }
                }

                for (Tradesman tr : trades) {
                    if (!tr.picked && !tr.done && tr.t <= tick && tr.u == train.pos) {
                        if (train.passengers.size() < C) {
                            actions.add("pick " + train.id + " " + tr.id);
                            train.passengers.add(tr.id);
                            tr.picked = true;
                        }
                    }
                }
            }

            List<String> moves = new ArrayList<>();

            for (Train train : trains) {
                if (train == null) continue;

                if (!train.passengers.isEmpty()) {
                    Tradesman tr = trades[train.passengers.get(0) - 1];
                    int next = getNext(train.pos, tr.v);

                    String edge = Math.min(train.pos, next) + "-" + Math.max(train.pos, next);
                    if (!usedEdges.contains(edge)) {
                        usedEdges.add(edge);
                        moves.add(train.id + " " + next);
                        train.pos = next;
                    }
                }
            }

            output.add(String.valueOf(actions.size()));
            output.addAll(actions);
            output.add(String.valueOf(moves.size()));
            output.addAll(moves);

            tick++;
        }

        System.out.println(output.size());
        for (String s : output) {
            System.out.println(s);
        }

    }
}