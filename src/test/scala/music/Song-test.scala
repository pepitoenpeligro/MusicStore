import org.scalatest.{FeatureSpec, GivenWhenThen}
import music.Song;

class SongSpec extends FeatureSpec with GivenWhenThen {
    info("As a music store")
    info("I want to be able to get duration of song in minutes")
    feature("toMinutes"){
        scenario("User store a song with duration data in seconds"){
            Given("a Song")
            val song = new Song("Physical", "Future Nostalgia", Array("Dua Lipa"), 194)
            When("All info is added in system")
            var result = song.toMinutes()
            Then("We get correct minutes")
            assert(result == "3:14")
        }

         scenario("User store a song with duration data in miliseconds"){
            Given("a Song")
            val song = new Song("Physical", "Future Nostalgia", Array("Dua Lipa"), 194000)
            When("All info is added in system")
            var result = song.toMinutes()
            Then("We get correct minutes")
            assert(result == "3:14")
        }
    }

}