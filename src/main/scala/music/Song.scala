package music;

class Song(t : String, al : String, ar: Array[String], d: Int){

    var _title : String = t
    var _album : String = al
    var _artist : Array[String] = ar
    var _duration : Int = d

    def title = _title
    def album = _album
    def artist = _artist
    def duration = _duration

    // def this(t : String, al : String, ar: Array[String], d: Int){
    //     this()
    //     this._title = t
    //     this._album = al
    //     this._artist = ar
    //     this._duration = d
    // }

    override def toString(): String = s"Title: ${this._title}, Album: ${this._album}, Artists: ${this._artist.mkString("")}, Duration: ${this._duration} seconds, minutes: ${this.toMinutes()}"


    def toMinutes() = {
        s"${this._duration/60}:${this._duration%60}"
    }



}