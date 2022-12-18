package example.model;

import beans.BeanProperty
import javax.persistence._

@Node
case class Doctor (
    var name: String,
    var department: String,
    var specialty: String
) {
  @Id
  var id: java.lang.Long = _

  def this()
  {
    this("", "", "");
    id = 0L;
  }

  def this(a: java.lang.Long, b: String, c: String, d: String)
  {
    this(b, c, d);
    id = a;
  }

  override def toString() = f"""{"id":$id%d, "name":"$name%s", "department":"$department%s", "specialty": "$specialty%s"}"""
}
