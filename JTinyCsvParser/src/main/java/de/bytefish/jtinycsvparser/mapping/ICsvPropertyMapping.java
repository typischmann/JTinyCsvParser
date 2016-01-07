// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.jtinycsvparser.mapping;

public interface ICsvPropertyMapping<TEntity>
{
    boolean tryMapValue(TEntity entity, String value);
}
