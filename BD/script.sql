USE [test]
GO
/****** Object:  Table [dbo].[Curso]    Script Date: 9/12/2019 10:08:24 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Curso](
	[id] [numeric](18, 0) NOT NULL,
	[nombrec] [nvarchar](50) NOT NULL,
	[cantidad] [numeric](18, 0) NOT NULL,
 CONSTRAINT [PK_Curso] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Estudiante]    Script Date: 9/12/2019 10:08:24 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Estudiante](
	[id] [numeric](18, 0) IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[edad] [numeric](18, 0) NOT NULL,
	[idCurso] [numeric](18, 0) NULL,
 CONSTRAINT [PK_Estudiante] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[Curso]  WITH CHECK ADD  CONSTRAINT [FK_Curso_Curso] FOREIGN KEY([id])
REFERENCES [dbo].[Curso] ([id])
GO
ALTER TABLE [dbo].[Curso] CHECK CONSTRAINT [FK_Curso_Curso]
GO
ALTER TABLE [dbo].[Estudiante]  WITH CHECK ADD  CONSTRAINT [FK_Estudiante_Curso] FOREIGN KEY([idCurso])
REFERENCES [dbo].[Curso] ([id])
GO
ALTER TABLE [dbo].[Estudiante] CHECK CONSTRAINT [FK_Estudiante_Curso]
GO
