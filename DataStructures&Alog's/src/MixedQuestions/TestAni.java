package MixedQuestions;

/**
 * Created by kunal on 2/11/18.
 */


import java.util.*;

public class TestAni {

        public String nextClosestTime(String time) {
            String[] strs = time.split(":");
            int inputTimeHour = ((strs[0].charAt(0) - '0') * 10 + (strs[0].charAt(1) - '0'));
            int inputTimeMinus = ((strs[1].charAt(0) - '0') * 10 + (strs[1].charAt(1) - '0'));
            if (inputTimeHour >= 24 || inputTimeMinus >= 60) {
                return "Invalid Input";
            }
            Set<Integer> candidates = new HashSet<>();
            for (String str : strs) {
                for (int i = 0; i < 2; i++) {
                    candidates.add(str.charAt(i) - '0');
                }
            }
            List<Integer> hours = allPossibility(candidates, 24);
            List<Integer> minus = allPossibility(candidates, 60);
            Collections.sort(minus);
            int inputTime = inputTimeHour * 60 + inputTimeMinus;
            List<Integer> allTimes = new ArrayList<>();
            for (Integer hour : hours) {
                for (Integer minu : minus) {
                    allTimes.add(hour * 60 + minu);
                }
            }
            Collections.sort(allTimes);
            int candidate = -1;
            for (Integer times : allTimes) {
                if (times > inputTime) {
                    candidate = times;
                    break;
                }
            }
            if (candidate == -1) {
                candidate = allTimes.get(0);
            }
            int candidateHours = candidate / 60;
            int candidateMinus = candidate % 60;
            String hourStr = candidateHours < 10 ? "0" + candidateHours :  "" + candidateHours;
            String minuStr = candidateMinus < 10 ? "0" + candidateMinus :  "" + candidateMinus;
            return hourStr + ":" + minuStr;
        }

        public List<Integer> allPossibility(Set<Integer> candidates, int filter) {
            List<Integer> hours = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                if (hours.size() == 0) {
                    hours.addAll(candidates);
                } else {
                    List<Integer> newHours = new ArrayList<>();
                    for (Integer hour : hours) {
                        for (Integer candidate : candidates) {
                            newHours.add(hour * 10 + candidate);
                        }
                    }
                    hours = newHours;
                }
            }
            List<Integer> res = new ArrayList<>();
            for (Integer ele : hours) {
                if (ele < filter) {
                    res.add(ele);
                }
            }
            return res;
        }


        public static void main(String[] args){
            TestAni a = new TestAni();
            System.out.println(a.nextClosestTime("11:00"));
        }

    }



