/*******************************************************************************
 * Copyright (c) 2009 Matthew Hall and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthew Hall - initial API and implementation (bug 263709)
 ******************************************************************************/

package org.eclipse.core.internal.databinding;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ValidationStatusProvider;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.list.ListProperty;

/**
 * @since 3.3
 * 
 */
public final class DataBindingContextValidationStatusProvidersProperty extends
		ListProperty {
	public Object getElementType() {
		return ValidationStatusProvider.class;
	}

	public IObservableList observe(Realm realm, Object source) {
		return ((DataBindingContext) source).getValidationStatusProviders();
	}

	public String toString() {
		return "Binding#validationStatusProviders[] <ValidationStatusProvider>"; //$NON-NLS-1$
	}
}