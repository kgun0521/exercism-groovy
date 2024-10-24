import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {

    static def add(LocalDate moment) {
        return moment.atStartOfDay().plusSeconds(10**9)
    }

    static def add(LocalDateTime moment) {
        return moment.plusSeconds(10**9)
    }
}
