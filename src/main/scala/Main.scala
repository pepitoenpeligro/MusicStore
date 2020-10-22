package music;


object Main extends App{
    var physical = new Song("Physical", "Future Nostalgia", Array("Dua Lipa"), 194)
    println(physical)
    println(s"Calling toMinutes(): ${physical.toMinutes()}")
}
