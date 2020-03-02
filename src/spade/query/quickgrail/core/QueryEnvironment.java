/*
 --------------------------------------------------------------------------------
 SPADE - Support for Provenance Auditing in Distributed Environments.
 Copyright (C) 2020 SRI International

 This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU General Public License as
 published by the Free Software Foundation, either version 3 of the
 License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program. If not, see <http://www.gnu.org/licenses/>.
 --------------------------------------------------------------------------------
 */
package spade.query.quickgrail.core;

import java.util.Set;

import spade.query.quickgrail.entities.Graph;
import spade.query.quickgrail.entities.GraphMetadata;

public interface QueryEnvironment{

	public void gc();
	public void clear();
	public Graph allocateGraph();
	public GraphMetadata allocateGraphMetadata();
	public Graph lookupGraphSymbol(String symbol);
	public GraphMetadata lookupGraphMetadataSymbol(String symbol);
	public void setGraphSymbol(String symbol, Graph graph);
	public void setGraphMetadataSymbol(String symbol, GraphMetadata graphMetadata);
	public void eraseGraphSymbol(String symbol);
	public void eraseGraphMetadataSymbol(String symbol);
	public boolean isBaseGraph(Graph graph);
	
	public String getBaseSymbolName();
	public Graph getBaseGraph();
	
	public Set<String> getAllGraphSymbolNames();
	
//	public GraphPredicate
	
}
