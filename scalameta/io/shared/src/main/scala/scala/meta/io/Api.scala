package org.langmeta.internal.io {
  trait Api extends org.langmeta.io.Api
  trait Aliases extends org.langmeta.io.Aliases
}

package scala.meta.io {
  private[meta] trait Api extends org.langmeta.internal.io.Api
  private[meta] trait Aliases extends org.langmeta.internal.io.Aliases
}
