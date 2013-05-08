/*
 * Copyright (C) 2013 Maciej Górski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.mg6.android.maps.extensions.impl;

import android.graphics.Point;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

//TODO: to be deleted when com.google.android.gms.maps.Projection becomes an interface
class ProjectionWrapper implements IProjection {

	private Projection projection;

	public ProjectionWrapper(Projection projection) {
		this.projection = projection;
	}

	@Override
	public LatLng fromScreenLocation(Point arg0) {
		return projection.fromScreenLocation(arg0);
	}

	@Override
	public VisibleRegion getVisibleRegion() {
		return projection.getVisibleRegion();
	}

	@Override
	public Point toScreenLocation(LatLng arg0) {
		return projection.toScreenLocation(arg0);
	}

	public Projection getProjection() {
		return projection;
	}
}
