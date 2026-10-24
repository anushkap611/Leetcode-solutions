class Solution {
    public final int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startA = dayToDayofYear(arriveAlice);
        int endA = dayToDayofYear(leaveAlice);
        int startB = dayToDayofYear(arriveBob);
        int endB = dayToDayofYear(leaveBob);

        int overlapStart = Math.max(startA, startB);
        int overlapEnd = Math.min(endA, endB);

        if(overlapStart<=overlapEnd) {
            return overlapEnd - overlapStart + 1;
        }
        return 0;
    }

    public int dayToDayofYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3,5));
        int dayCount = 0;
        for(int i = 0; i<month-1; i++) {
            dayCount += dayInMonth[i];
        }
        return dayCount + day;
    }
}