package pjatk.time;

public class Time {
        final int hours;
        final int minutes;

    public Time(final int hours, final int minutes) {
            this.hours = hours;
            this.minutes = minutes;
        }

        public Time addtime(final Time new_time) {
            final int addtime = (this.minutes + new_time.minutes) / 60;
            return new Time(this.hours + new_time.hours + addtime, (this.minutes + new_time.minutes) % 60);
        }

        public Time multiplier(final int multi) {
            final int addtime = (this.minutes * multi) / 60;
            return new Time(this.hours * multi + addtime, (this.minutes * multi) % 60);
        }
        @Override
         public String toString() {
             return (this.hours+"h\t"+this.minutes+"min");
    }

}
