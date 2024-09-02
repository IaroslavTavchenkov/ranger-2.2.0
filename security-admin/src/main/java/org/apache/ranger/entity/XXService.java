/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ranger.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Cacheable
@XmlRootElement
@Table(name = "x_service")
public class XXService extends XXServiceBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id of the XXService
	 * <ul>
	 * </ul>
	 *
	 */
	@Id
	@SequenceGenerator(name = "x_service_SEQ", sequenceName = "x_service_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "x_service_SEQ")
	@Column(name = "id")
	protected Long id;

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "XXService [id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		XXService other = (XXService) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}