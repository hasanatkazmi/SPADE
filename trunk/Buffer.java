/*
--------------------------------------------------------------------------------
SPADE - Support for Provenance Auditing in Distributed Environments.
Copyright (C) 2011 SRI International

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

import java.util.concurrent.*;

public class Buffer {

    private ConcurrentLinkedQueue queue;

    public Buffer() {
        queue = new ConcurrentLinkedQueue();
    }

    public boolean putVertex(Vertex v) {
        queue.add(v);
        return true;
    }

    public boolean putEdge(Edge e) {
        queue.add(e);
        return true;
    }

    public Object getBufferElement() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
