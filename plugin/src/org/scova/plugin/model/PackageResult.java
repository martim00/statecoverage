package org.scova.plugin.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PackageResult extends Result {
	public PackageResult(String packageName) {
		super(packageName);
	}

	private Map<String, ClassResult> classResult = new HashMap<String, ClassResult>();

	public ClassResult addAndReturnClass(String className) {
		if (!classResult.containsKey(className)) {
			classResult.put(className, new ClassResult(className));
		}
		return classResult.get(className);
	}

	public Object[] getClasses() {
		return classResult.values().toArray();
	}
}
