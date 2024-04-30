fun main() {
  val log = Kotlog()

  log.euroFormat(true)

  log.info("Information Text...")
  log.warn("Warn Text...")
  log.error("Error Text...")
  log.custom("YOUR OPTION", "Cutsom Text...")
}
