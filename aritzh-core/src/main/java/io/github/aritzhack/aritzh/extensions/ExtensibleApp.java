/*
 * Copyright 2014 Aritz Lopez
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.aritzhack.aritzh.extensions;

import io.github.aritzhack.aritzh.eventBus.EventBus;
import org.reflections.Reflections;

/**
 * A extensible app.
 *
 * @author Aritz Lopez
 * @see io.github.aritzhack.aritzh.extensions.Extensions
 */
public interface ExtensibleApp {

	/**
	 * Returns an instance of Reflections used to load the extensions. {@link org.reflections.Reflections#Reflections(Object...)} by providing a ClassLoader
	 *
	 * @return an instance of Reflections used to load the extensions
	 */
	public Reflections getReflections();

	/**
	 * Returns EventBus into which the extension-related events should be posted
	 *
	 * @return the EventBus for the extension-related events
	 */
	public EventBus getExtensionsEventBus();
}
