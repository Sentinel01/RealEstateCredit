package de.demimoranes.realestatecredit

import groovy.lang.Script

abstract class DslDefinition extends Script {

	def Wenn(Map m, boolean condition) {
		if(condition) {
			m.Dann
		}
		else {
			m.Sonst
		}
	}
	
	def Falls(Map m, def key) {
		m[key]
	}
	
	def Miete(def monatlicheMiete) {
		new MietFassade(monatlicheMiete: monatlicheMiete)
	}

}
