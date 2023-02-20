/**
 * This module is the "client" module, and it consits of packages : com.enetertainment.client
 *
 * As the "client" module, it does not export anything.
 * BUT it does need to declare a dependency on modue com.entertainment.
 */

module com.entertainment.client {
    // what other *modules* does this module depend on?
    // This module has access (visibility) to the *exported* packages (only)
    // of the other module
    requires com.entertainemt; // this is a *module* name
}