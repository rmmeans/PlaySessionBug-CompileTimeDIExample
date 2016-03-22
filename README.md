

### Session issues when using Compile Time DI in Play 2.5.0

This is an example project showing an issue when using compile time DI. The `.withSession()` method on the `Result` fails when compile time DI is being used. 

Edit the config file and comment out the application loader and the app will start working again.

