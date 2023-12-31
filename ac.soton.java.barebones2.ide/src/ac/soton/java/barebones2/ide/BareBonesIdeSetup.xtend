/*
 * generated by Xtext 2.15.0
 */
package ac.soton.java.barebones2.ide

import ac.soton.java.barebones2.BareBonesRuntimeModule
import ac.soton.java.barebones2.BareBonesStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class BareBonesIdeSetup extends BareBonesStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new BareBonesRuntimeModule, new BareBonesIdeModule))
	}
	
}
