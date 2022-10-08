# Compose-Navigation
A simple application to use and present the navigation component of jetpack compose. For build gradle, I used '1.3.0-rc01' compose version and implement the navigation 
compose version of 2.5.2 in dependencies.

compose_version = '1.3.0-rc01'

dependencies {
  ...
  
  def nav_version = "2.5.2"
      implementation("androidx.navigation:navigation-compose:$nav_version")
}
