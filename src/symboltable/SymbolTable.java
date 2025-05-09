package symboltable;

import java.util.*;
import ast.program.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<Map<String, Definition>>();
		table.add(new HashMap<String, Definition>());
	}

	public void set() {
		table.add(new HashMap<String, Definition>());
		scope++;
	}
	
	public void reset() {
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		if (findInCurrentScope(definition.getName()) != null)
			return false;
		definition.setScope(scope);
		table.get(scope).put(definition.getName(), definition);
		return true;
	}
	
	public Definition find(String id) {
		for (int i = table.size() - 1; i >= 0; i--) {
			if (table.get(i).containsKey(id))
				return table.get(i).get(id);
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		if (table.get(scope).containsKey(id))
			return table.get(scope).get(id);
		return null;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}
}



