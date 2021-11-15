import java.io.File

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  private def filesMatching(matcher: String => Boolean): File = {
    for (file <- filesHere; matcher(file.getName))
      yield file
  }
  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(query))
  def filesContaining(query: String): File =
    filesMatching(query, _.contains(query))
  def filesRegex(query: String): File =
    filesMatching(query, _.matches(query))
}